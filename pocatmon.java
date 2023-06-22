public class pocatmon {
	
	int lv = 1;
	int hp = 50;
	int atk = 7;
	String name;
	
	pocatmon() {
		this.name = "포켓몬";
	}
	
	pocatmon(String name) {
		this.name = name;
	}
	
	
	void LvUp() {
		lv++;
		hp+=10;
		atk+=2;
	}
	
	void Atk() {
		System.out.println(name+"이 를 공격합니다.");
	}
}
