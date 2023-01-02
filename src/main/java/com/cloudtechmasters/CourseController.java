package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create three endpoints getAllCricketTeams and getInternationalteams and getDomesticteams
    @GetMapping("/")
    public List<String> getAllCricketTeams(){
        logger.info("added for failing sonar build");
        return Arrays.asList("Cricket Teams");
    }

    @GetMapping("/international")
    public List<String> getInternationalteams(){
        return Arrays.asList("International teams: India, Ireland, Pakistan, Australia, West indies, England");
    }
    @GetMapping("/domestic")
    public List<String> getDomesticteams(){
        return Arrays.asList("Domestic teams: Malta, Nigeria, Philippines, Peru, Mexico, China");
    }

}
