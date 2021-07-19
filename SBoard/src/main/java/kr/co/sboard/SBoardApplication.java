package kr.co.sboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("kr.co.sboard.dao")
@SpringBootApplication
public class SBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBoardApplication.class, args);
	}

}
