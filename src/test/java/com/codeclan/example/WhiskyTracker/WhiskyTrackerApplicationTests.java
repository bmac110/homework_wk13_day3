package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskyByYear(){
		List<Whisky> foundWhisky = whiskyRepository.findWhiskyByYear(2018);
		assertEquals(2, foundWhisky.size());
	}

	@Test
	public void canGetDistilleriesByRegion(){
		List<Distillery> foundDistillery = distilleryRepository.findDistilleriesByRegion("Speyside");
		assertEquals(2, foundDistillery.size());
	}

//	@Test
//	public void canGetWhiskyByDistilleryId(){
//		List<Whisky> foundWhisky = whiskyRepository.getWhiskyByDistilleryId(1L);
//		assertEquals(2, foundWhisky.size());
//	}



}
