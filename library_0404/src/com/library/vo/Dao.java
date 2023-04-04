package com.library.vo;

import java.util.List;


public interface Dao {
	// 파일로부터 데이터를 읽어서 리스트에 담아 반환합니다.
	List<Book> getList(); // 도서 리스트
	boolean saveFile(List<Book> list);  // 생성
	boolean deleteFile(List<Book> list); // 삭제
	boolean updateFile(List<Book> list); // 수정
}
