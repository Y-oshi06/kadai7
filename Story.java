import java.util.Scanner;
public class Story {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
		hero h = new hero("ルフィ",19);//勇者
		System.out.println("ヒーローの守備力を入力してください");
		h.df = scan.nextInt();

		System.out.println("名前:" + h.name);
		System.out.println("体力:" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("守備力:" + h.df);
		System.out.println(" ");
		
		//doragon
		System.out.println(" ");
		Scanner scan2 = new Scanner(System.in);
		doragon g = new doragon("カイドウ");//
		
		System.out.println("ドラゴンの攻撃力を入力してください");
		g.at = scan2.nextInt();
		System.out.println("ドラゴンの守備力を入力してください");
		g.df = scan2.nextInt();
		
	
		System.out.println("名前:" + g.name);
		System.out.println("体力:" + g.hp);
		System.out.println("攻撃力:" + g.at);
		System.out.println("守備力:" + g.df);
		System.out.println(" ");
		
		//魔法使い
		System.out.println(" ");
		Scanner scan3 = new Scanner(System.in);
		Magician m = new Magician("ゾロ");//
		System.out.println("魔法使いの攻撃力を入力してください");
		m.at = scan3.nextInt();
		System.out.println("魔法使いの守備力を入力してください");
		m.df = scan3.nextInt();
		m.MP = 10;
		m.recovery = 10;
		
		
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("守備力:" + m.df);
		
		scan.close();
		scan2.close();
		scan3.close();
		
		m.atack();
		m.wizard_attack();
		m.wizard_recovery();
		
		
		
	}
	

}
