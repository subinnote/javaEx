package com.library.vo;

import java.util.List;

import com.library.dao.DatabaseDao;

public class Library {
	
	// 필드(전역변수) 
	// 클래스내부에서 어디서든 사용할 수 있음
	private List<Book> list;
	// FileDao 또는 DatabaseDao 로 생성할 수 있도록
	// 인터페이스를 타입으로 선언
	private Dao dao = new FileDao();
	
	public Library() { // Library 생성자 : 클래스와 동일한 이름을 가지고 있고 반환타입이 없다
		// 파일을 읽어서 리스트를 초기화 합니다.
		list = dao.getList();
	}
	
	public boolean insert(int no, String title, String author, boolean isRent) {
		
		// 인덱스 넘버 중복체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		// 외부로부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
		Book book = new Book(no, title, author, isRent);
		// 리스트를 파일에 저장
		list.add(book); // 리스트에 입력해주는거라 아래로 넣으면 안됨
		boolean res = dao.saveFile(list);
		if(res) {
			// 파일에 성공적으로 저장하면 리스트에 추가
			return true;
		} else {
			list.remove(book); // 만약 실패하면 리스트에서 삭제
			return false;
		}
		
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) { // 대소문자 구분 안함
			dao = new DatabaseDao();
	}
}
	@Override
	public String toString() {
		String listStr = "";
		for (Book book:list) {
			listStr += book.toString() + "\n";
		}
		return listStr;
	}
}
