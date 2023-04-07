package 복습0406;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01MusicPlayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
		
		int menu;
		String musicName;
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				currentList(musiclist);
				
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				menu = sc.nextInt();
				
				if(menu == 1) {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					musicName = sc.nextLine();
					musiclist.add(musicName);
					System.out.println("추가가 완료되었습니다.\n");
				}else {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					musicName = sc.nextLine();
					System.out.print("추가할 위치 입력 >> ");
					menu = sc.nextInt();
					musiclist.add(menu-1, musicName);
					System.out.println("추가가 완료되었습니다.\n");
				}
				
			}else if(menu==2) {
				
				currentList(musiclist);
				
				if(musiclist.size()==0) {
					continue;
				}
				
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				menu = sc.nextInt();
				
				if(menu==1) {
					System.out.print("삭제할 노래 선택 >> ");
					menu = sc.nextInt();
					musiclist.remove(menu-1);
					System.out.println("노래가 삭제되었습니다.\n");
				}else {
					musiclist.clear();
					System.out.println("전체list가 삭제되었습니다.\n");
				}
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		
		}
		
	}
	
	public static void currentList(ArrayList<String> musiclist) {
		System.out.println("======== 현재 재생 목록 ========");
		if(musiclist.size()==0) {
			System.out.println("재생 목록이 없습니다.");
		}else {
			for(int i = 0 ; i < musiclist.size() ; i++) {
				System.out.println(i+1 + "." + musiclist.get(i));
			}
		}
		System.out.println("============================");
	}

}
