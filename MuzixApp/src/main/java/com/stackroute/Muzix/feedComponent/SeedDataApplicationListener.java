//package com.stackroute.Muzix.feedComponent;
//
//
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.exceptions.TrackAlreadyExistsException;
//import com.stackroute.Muzix.service.TrackService;
//
//import lombok.Data;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.context.ApplicationListener;
//
//import org.springframework.context.annotation.Primary;
//
//import org.springframework.context.event.ContextRefreshedEvent;
//
//import org.springframework.core.env.Environment;
//
//import org.springframework.stereotype.Component;
//
//@Component
//
//@Data
//
//@Primary
//
//public class SeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent>
//
//{
//
//    @Autowired
//
//    Environment environment;
//
//    @Autowired
//
//    TrackService trackService;
//
//    Track feedTrackData=new Track();
//
//    @Override
//
//    public void onApplicationEvent(ContextRefreshedEvent event)
//
//    {
//
//        feedTrackData.setTrackId(Integer.parseInt(environment.getProperty("song.1.trackId")));
//
//        feedTrackData.setTrackName(environment.getProperty("song.1.trackName"));
//
//        feedTrackData.setComment(environment.getProperty("song.1.comment"));
//
//        try {
//
//            trackService.saveTrack(feedTrackData);
//
//        } catch (TrackAlreadyExistsException e) {
//
//            e.printStackTrace();
//
//        }
//
//        feedTrackData.setTrackId(Integer.parseInt(environment.getProperty("song.2.trackId")));
//
//        feedTrackData.setTrackName(environment.getProperty("song.2.trackName"));
//
//        feedTrackData.setComment(environment.getProperty("song.2.comment"));
//
//        try {
//
//            trackService.saveTrack(feedTrackData);
//
//        } catch (TrackAlreadyExistsException e) {
//
//            e.printStackTrace();
//
//        }
//
//        feedTrackData.setTrackId(Integer.parseInt(environment.getProperty("song.3.trackId")));
//
//        feedTrackData.setTrackName(environment.getProperty("song.3.trackName"));
//
//        feedTrackData.setComment(environment.getProperty("song.3.comment"));
//
//        try {
//
//            trackService.saveTrack(feedTrackData);
//
//        } catch (TrackAlreadyExistsException e) {
//
//            e.printStackTrace();
//
//        }
//
//
//
//    }
//
//}