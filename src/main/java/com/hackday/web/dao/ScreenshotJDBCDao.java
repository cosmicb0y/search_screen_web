package com.hackday.web.dao;

import com.hackday.web.domain.Path;
import com.hackday.web.domain.Screenshot;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScreenshotJDBCDao implements ScreenshotDao {
    private final JdbcTemplate jdbcTemplate;

    public ScreenshotJDBCDao() {
        BasicDataSource source = new BasicDataSource();

        source.setDriverClassName("com.mysql.cj.jdbc.Driver");


        this.jdbcTemplate = new JdbcTemplate(source);
    }

    List<String> getArea() {

    }

    List<String> getType(String area); // 타입들 가져오기
    List<Screenshot> getItem(String area, String type); // 아이템 가져오기
    List<Path> getPath(); // 스크린샷 경로들 가져오기
    void modify(Screenshot src, Screenshot dst); // description 수정
    void delete(); // 삭제


}
