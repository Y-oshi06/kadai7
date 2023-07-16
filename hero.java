
public class hero {
	String name;
	int hp;
	int at;
	int df;

	hero(String name,int a){
		this.name = name;
		this.hp = a;
		this.at = 5;
		
	}
	hero(String name,int n,int a){
		this.name = name;
		this.hp = n;
		this.at = a;
		
	}
	hero(){
		System.out.println("a");
		System.exit(0);
	}
	
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
