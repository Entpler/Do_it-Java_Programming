package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102,"������");
		Member membershin = new Member(103,"�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(membershin);
		
		
		memberArrayList.showAll();
		
	}

}