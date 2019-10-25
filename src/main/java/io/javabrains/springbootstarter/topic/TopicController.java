package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topic")
	public List<Topic> seeTopic()
	{
		return Arrays.asList(
				new Topic("Spring", "Spring framework", "Spring framework description"),
				new Topic("java", "core java", "java description")
				
				);
	}

}
