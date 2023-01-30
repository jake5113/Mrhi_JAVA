
public class Race implements Unit {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("날아서 이동!");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사!");
	}

	public void ghostMode() {
		System.out.println("안보이지~~");
	}

}
