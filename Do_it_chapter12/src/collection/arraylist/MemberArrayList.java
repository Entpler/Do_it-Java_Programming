package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	} // arrayList����

	public void addMember(Member member) {
		arrayList.add(member); // member�� �Ű������� �ؼ� arraylist�� ����
	}

	public boolean removeMeber(int memberId) { // memeber���� // ����� �����Ǹ� true�� return
		/*
		 * for (int i = 0; i < arrayList.size(); i++) {//arryList�� ������(����) ��ŭ �ݺ� Member
		 * member = arrayList.get(i); //memberId �� �޾Ƽ� ���� memberId�� ���� ���� ���� int tempId
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

		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAll() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println(arrayList);
	}
}
