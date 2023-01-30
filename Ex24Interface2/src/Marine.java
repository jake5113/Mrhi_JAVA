
public class Marine implements Unit, LevelUpAble {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걸어서 이동");
	}

	@Override
	public void attack() {
		System.out.println("총알발사");
	}
	
	@Override
	public void levelUp() {
		System.out.println("불꽃마린으로 변신!!");
	}

	public void steamPack() {
		System.out.println("공속 이속 업글!!");
	}


}
