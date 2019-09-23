package cn.wy.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="cn.wy.server1.mapper")
public class Server1Application {

	public static void main(String[] args) {
		SpringApplication.run(Server1Application.class, args);
	}

}
