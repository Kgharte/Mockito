//package com.stackroute.Muzix.bootstrap;
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SeeDataApplicationRunner implements ApplicationRunner {
//
//    private TrackRepository trackRepository;
//
//    @Autowired
//    public SeeDataApplicationRunner(TrackRepository trackRepository) {
//        this.trackRepository = trackRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Track t1 = Track.builder().trackName("Jeena jeena").comment("Atif aslam").build();
//        trackRepository.save(t1);
//
//        Track t2 = Track.builder().trackName("Breathless").comment("Shakar Mahadevan").build();
//        trackRepository.save(t2);
//
//        Track t3 = Track.builder().trackName("Dooriyan").comment("Mohit Chauhan").build();
//        trackRepository.save(t3);
//
//        Track t4 = Track.builder().trackName("Dil kyu mera").comment("Arijith Singh").build();
//        trackRepository.save(t4);
//
//        Track t5 = Track.builder().trackName("Nain ne bandh").comment("Darshan Raval").build();
//        trackRepository.save(t5);
//
//        Track t6 = Track.builder().trackName("Dil kya kare").comment("Kishor Kumar").build();
//        trackRepository.save(t6);
//
//        Track t7 = Track.builder().trackName("Ab tumhare hawale").comment("Rafi").build();
//        trackRepository.save(t7);
//
//        Track t8 = Track.builder().trackName("Jeena yaha marna yaha").comment("Mukesh").build();
//        trackRepository.save(t8);
//
//        Track t9 = Track.builder().trackName("Sochenge tumhe pyar").comment("Kumar Sanu").build();
//        trackRepository.save(t9);
//
//        Track t10 = Track.builder().trackName("Apna mujhe tu laga").comment("Sonu Nigam").build();
//        trackRepository.save(t10);
//
//
//    }
//}
