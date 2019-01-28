//package com.stackroute.Muzix.bootstrap;
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//
//public class SeeDataApplicationListener implements ApplicationListener
//{
//    private TrackRepository trackRepository;
//    @Autowired
//    public SeeDataApplicationListener(TrackRepository trackRepository) {
//        this.trackRepository = trackRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//        Track t1 = new Track("Jeena Jeena","Atif aslam");
//        trackRepository.save(t1);
//    }
////