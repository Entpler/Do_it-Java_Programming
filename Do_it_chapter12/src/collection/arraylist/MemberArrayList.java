package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	} // arrayList선언

	public void addMember(Member member) {
		arrayList.add(member); // member를 매개변수로 해서 arraylist에 삽입
	}

	public boolean removeMeber(int memberId) { // memeber삭제 // 제대로 삭제되면 true를 return
		/*
		 * for (int i = 0; i < arrayList.size(); i++) {//arryList의 사이즈(길이) 만큼 반복 Member
		 * member = arrayList.get(i); //memberId 를 받아서 삭제 memberId가 같은 것을 삭제 int tempId
		 * = member.getMemberId(); if (memberId == tempId) { arrayList.remove(i); return
		 * true; } }
		 */

		Iterator<Member> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAll() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println(arrayList);
	}
}
