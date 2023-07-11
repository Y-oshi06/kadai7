
public class Magician {
	String name;
	int hp;//体力
	
	int at;//攻撃力
	int df;//防御力
	int MP;//魔法
	int recovery;//回復力
	
	void atack() {//攻撃
		System.out.println(this.name + "の攻撃");
		System.out.println(this.name + "は" + this.at +"を相手に与えた");
	}
	void defense() {//防御
		System.out.println(this.name + "は防御した");
		System.out.println(this.name + "の防御力は10上がった");
	}
	void wizard_attack() {//攻撃魔法
		System.out.println(this.name + "の魔法攻撃");
		System.out.println(this.name + "は" + this.at * 2 + "を相手に与えた");
		System.out.println("MPを5消費した");
		this.MP -= 5;
		System.out.println("MPは"+ MP + "になった");
	}
	void wizard_recovery() {//回復魔法
		System.out.println(this.name + "は回復魔法を使った");
		System.out.println(this.name + "は" + this.recovery + "を回復した");
		System.out.println("MPを3消費した");
		MP -= 3;
		System.out.println("MPは"+ this.MP +"になった");
		this.hp += recovery;
		System.out.println("体力は"+ this.hp + "になった");
		
		
	}
	void heal() {//休憩
		System.out.println(this.name + "は休憩した");
		System.out.println(this.name + "のHPは10回復し" + this.hp + "になった");
	}

}
