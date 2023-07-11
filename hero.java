
public class hero {
	String name;
	int hp;
	int at;
	int df;
	
	void attack(){//攻撃
		System.out.println(this.name + "の攻撃");
		System.out.println(this.name + "は" + at +"を相手に与えた" );
	}
	
	void defense() {//守備
		System.out.println(this.name + "は防御した");
		System.out.println("防御力が10上がって" + this.df + "になった");
	}
	
	void heal() {//回復
		System.out.println(this.name + "は休憩した");
		System.out.println(this.name + "のHPは10回復し" + this.hp + "になった");
	}

}
