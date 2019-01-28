package com.stackroute.Muzix.Controller;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exceptions.TrackAlreadyExistsException;
import com.stackroute.Muzix.exceptions.TrackNotFoundException;
import com.stackroute.Muzix.service.TrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api(value="MuziX", description="Track1")
public class TrackController
{
    private TrackService trackService;
    ResponseEntity responseEntity;
    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @ApiOperation(value = "Accept track into repository")
    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) throws TrackAlreadyExistsException,TrackNotFoundException
    {

        try {
            trackService.saveTrack(track);
            responseEntity = new ResponseEntity<Track>(track, HttpStatus.CREATED);
        }catch (TrackAlreadyExistsException ex)
        {
            responseEntity = new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;

    }

    @ApiOperation(value = "return track into repository")
    @GetMapping("track")
    public ResponseEntity<?> getAllTracks()
    {
        return new ResponseEntity<List<Track>>(trackService.getAllTracks(),HttpStatus.OK);
    }

    @GetMapping("trackByName/{name}")
    public ResponseEntity<?> findByName(@PathVariable("name") String name)
    {

        Track track = trackService.findByName(name);
        return new ResponseEntity<Track>(trackService.findByName(name),HttpStatus.OK);

    }


    @ApiOperation(value = "update track into repository")
    @PutMapping("track")
    public  ResponseEntity<?> updateTrack(@RequestBody Track track)
    {

        trackService.updateTrack(track);
        responseEntity = new ResponseEntity<Track>(track, HttpStatus.CREATED);
    return responseEntity;
    }

    @ApiOperation(value = "delete track from repository")
    @DeleteMapping("track/{trackId}")
    public ResponseEntity<?> deleteTrack(@PathVariable("trackId") int trackId) throws TrackNotFoundException {
        trackService.deleteTrack(trackId);
        responseEntity = new ResponseEntity<String>("deleted", HttpStatus.OK);
        return responseEntity;
    }
}
