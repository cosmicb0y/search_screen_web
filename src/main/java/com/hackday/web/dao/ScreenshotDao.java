package com.hackday.web.dao;

import com.hackday.web.domain.Path;
import com.hackday.web.domain.Screenshot;

import java.util.List;

public interface ScreenshotDao {
    List<String> getArea(); // 영역들 가져오기
    List<String> getType(String area); // 타입들 가져오기
    List<Screenshot> getItem(String area, String type); // 아이템 가져오기
    List<Path> getPath(); // 스크린샷 경로들 가져오기
    void modify(Screenshot src, Screenshot dst); // description 수정
    void delete(); // 삭제
}
