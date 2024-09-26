
public class HealingItem implements Item {
	
	private boolean useInBattle;
	private boolean consumed;
	private int amt;
	
	public HealingItem() {
		amt = 0;
		consumed = true;
		useInBattle = true;
	}
	
	public HealingItem(int amt) {
		this.amt = amt;
		consumed = false;
		useInBattle = true;
	}

	@Override
	public void use(Pokemon p) {
		if(!consumed) {
			System.out.println(p.name + " has healed " + amt + " hp!");
			p.hitPoints += amt;
			consumed = true;
		}else {
			System.out.println("Item was already consumed!");
		}
		
	}

}
