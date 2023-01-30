
public class Tank implements Unit,LevelUpAble {

	@Override
	public void move() {
		System.out.println("바퀴로 이동");
	}

	@Override
	public void attack() {
		System.out.println("자주포 발사!");

	}
	
	@Override
	public void levelUp() {
		System.out.println("미친 탱크!");
		
	}
	
	public void seizeMode() {
		System.out.println("시즈모드!");
		
	}

	
}
