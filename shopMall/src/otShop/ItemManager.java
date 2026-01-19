package otShop;

import java.util.*;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	
	//카테고리는 String 자료형으로 ArrayList<>생성할 것
	ArrayList<String> category = new ArrayList<String>();
	
	//전체 아이템리스트는 Item 자료형으로 ArrayList<>생성할 것
	ArrayList<Item> itemList = new ArrayList<Item>();
	//[0] => {name : ~ , price : ~ , category : ~}
	
	//전체 장바구니 => Cart 클래스를 자료형으로 ArrayList<>생성한다.
	ArrayList<Cart> jangList = new ArrayList<Cart>();
	
	//객체화(=인스턴스화)
	UserMenu user = new UserMenu();
	
	//디폴트 생성자
	public ItemManager() {info();};
	
	//itemList에 아이템 추가하는 메서드 => ArrayList<>에서 추가하는 메서드 add()
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name,price,category));
	}
	
	//카테고리 추가 메서드
	public void info() {
		category.add("과자"); // index 0
		category.add("생선"); // index 1
		category.add("육류"); // index 2
		category.add("음료수"); // index 3
		addItem("새우깡",1000,category.get(0));
		addItem("고등어",2000,category.get(1));
		addItem("칸 쵸",3600,category.get(0));
		addItem("소고기",6500,category.get(2));
		addItem("돼지고기",5500,category.get(2));
		addItem("콜라",1000,category.get(3));
		addItem("사이다",1500,category.get(3));
		addItem("새우",1800,category.get(1));
	}
	
	//카테고리 출력 메서드
	public void printCategory() {
		for(int i =0; i<category.size(); i++) {
			System.out.println("["+i+"]"+category.get(i)+" ");
		}
	}
	
	//아이템 목록 출력 메서드
	public void printItemList() {
		for(int i = 0; i<itemList.size(); i++) {
			System.out.print("["+i+"]");
			itemList.get(i).printInfo();
		}
	}
	
	//-------------------------장바구니-------------------------//
	//usid => id, caId => 카테고리 index번호 , itemID = > itdm index번호
	public void addCart(String usid, int caId, int itemId) {
		// 이미 장바구니에 아이템이 존재하는지 검사
		// 이미 존재하면 수량누적, 가격 누적 필요함
		// Cart 인스턴스화
		int cnt = 0; //개수
		int jangcnt = 0; //장바구니에 중복된 데이터의 존재유무 치트키
		int log = user.logindex; //UserMenu 클래스의 로그인된 log값을 static 으로 공유함
		// 개발에서 temp 의 의미는 임시저장소 뜻을 가진다.
		Cart temp = new Cart();
		temp.userId = usid;
		for(int i=0; i<itemList.size(); i++) {
			// 장바구니 추가에 뭘 비교해야하는가
			// 이미 장바구니에 아이템이 존재하는지 검사
			// itemList.get(0).name => "새우깡"
			// itemList.get(2).name => "칸 쵸"
			if(itemList.get(itemId).name.equals(itemList.get(i).name)) {//아이템리스트에없는거 입력방지하는 예외
				//조건이 true 면 수량 누적
				jangcnt = 0;
				for(int j =0; j<jangList.size(); j++) {
					//비교 현재 장바구니에 담긴 아이템 이름과 아이템 리스트에 존재하는 이름이 같은지
					if(jangList.get(j).itemName.equals(itemList.get(i).name)
							&& jangList.get(j).userId.equals(user.id[log])) {
						//수량 누적 
						jangList.get(j).price += itemList.get(i).price;
						jangList.get(j).quantity +=1;
						jangcnt += 1;
					}
				}
				//아직 장바구니에 상품이 존재하지 않을 때
				if(jangcnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.price = itemList.get(i).price;
					cnt += 1 ;
					temp.quantity = cnt; //이게맞나
					//장바구니 추가
					jangList.add(temp);
				}
			}
		}
	}
	//장바구니 출력 메서드
	public void printJang() {
		for(int i =0; i<jangList.size(); i++) {
			jangList.get(i).printCart();
		}
	}
	//전체 item 추가 메소드
	public void addItem02(String addname, int addprice, int addcategory) {
		//Item 클래스 추가 => add
		Item temp = new Item(addname, addprice,category.get(addcategory));
		itemList.add(temp);
	}
	//전체 item 삭제 메소드
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	//전체 item 수정 메소드
	public void updateItem(int indexNum, String upName, int upPrice) {
		//for(int i = 0; i<itemList.size(); i++) {
			itemList.get(indexNum).name = upName;
			itemList.get(indexNum).price = upPrice;
		//}
	}
}
