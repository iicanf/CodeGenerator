package com.iicanf;

import com.iicanf.model.McOrderFile;
import com.iicanf.service.McOrderFileService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Slf4j
public class TestJoinQuery {

    @Autowired
    McOrderFileService mcOrderFileService;

    @Test
    public void test() {
        List<McOrderFile> list = mcOrderFileService.queryOrderFile();
        log.info("{}", list);
    }
}
