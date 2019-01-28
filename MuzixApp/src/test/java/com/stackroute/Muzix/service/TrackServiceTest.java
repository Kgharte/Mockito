package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exceptions.TrackAlreadyExistsException;
import com.stackroute.Muzix.repository.TrackRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class TrackServiceTest {

    Track track;

    //Create a mock for UserRepository
    @Mock
    TrackRepository trackRepository;

    //Inject the mocks as dependencies into UserServiceImpl
    @InjectMocks
    TrackServiceImpl trackService;
    List<Track> list= null;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        track = new Track();
        track.setTrackId(1);
        track.setTrackName("John");
        track.setComment("Depth");
        list = new ArrayList<>();
        list.add(track);
    }


    @Test
    public void saveTrackTestSuccess() throws TrackAlreadyExistsException {

        when(trackRepository.save((Track) any())).thenReturn(track);
        Track savedUser = trackService.saveTrack(track);
        Assert.assertEquals(track,savedUser);

        //verify here verifies that userRepository save method is only called once
        verify(trackRepository,times(1)).save(track);

    }

    @Test(expected = TrackAlreadyExistsException.class)

    public void saveTrackTestFailure() throws TrackAlreadyExistsException {

        when(trackRepository.save((Track)any())).thenReturn(null);
        Track savedTrack = trackService.saveTrack(track);
        System.out.println("savedTrack" + savedTrack);
        Assert.assertEquals(track,savedTrack);

    }

    @Test
    public void getAllUser(){

        trackRepository.save(track);
        //stubbing the mock to return specific data
        when(trackRepository.findAll()).thenReturn(list);
        List<Track> userlist = trackService.getAllTracks();
        Assert.assertEquals(list,userlist);
    }

}