package com.stackroute.Muzix.repository;

import com.stackroute.Muzix.domain.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class TrackRepositoryTest {

    @Autowired
    TrackRepository trackRepository;
    Track track;
    @Before
    public void setUp() throws Exception {
        track = new Track();
        track.setTrackId(1);
        track.setTrackName("John");
        track.setComment("Depth");

    }

    @After
    public void tearDown() throws Exception {

        trackRepository.deleteAll();
    }

    @Test
    public void testSaveTrack(){
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        Assert.assertEquals(1,fetchTrack.getTrackId());

    }

    @Test
    public void testGetAllTrack(){
        Track t1 = new Track(1,"Johny","Depth");
        Track t2 = new Track(2,"Harry","Porter");
        trackRepository.save(t1);
        trackRepository.save(t2);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("Johny",list.get(0).getTrackName());
    }


    @Test
    public void testSaveTrackFailure(){
        Track testUser = new Track(2,"Harry","Porter");
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        Assert.assertNotSame(testUser,track);
    }


}