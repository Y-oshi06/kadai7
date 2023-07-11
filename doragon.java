
public class doragon {
	String name;
	int hp;//体力
	
	int at;//攻撃力
	int df;//防御力
	
	
	void atack() {
		System.out.println(this.name + "の攻撃");
		System.out.println(this.name + "は" + this.at +"を相手に与えた");
	}
	void defense() {
		System.out.println(this.name + "は防御した");
		System.out.println(this.name + "の防御力は10上がった");
	}
	

}
