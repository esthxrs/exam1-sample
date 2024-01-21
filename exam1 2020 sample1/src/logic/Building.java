package monkey;

import java.util.ArrayList;

public class Building {
	private ArrayList<EnterProfile> enterProfileList;

	private int populationCount = 0;
	private int potentialInfectedCount = 0;
	
	public Building() {
		enterProfileList = new ArrayList<EnterProfile>();
	}

	public EnterProfile addProfile(Person person, int temperature) {
		//Fill Code Here
		EnterProfile enterProfile = new EnterProfile(person, temperature);

		for (EnterProfile enterprofile : enterProfileList){
			if(enterprofile.getPerson().equals((enterProfile).getPerson())){
				int index = enterProfileList.indexOf(enterprofile);
				removeProfile(index);
				break; // not break=Error because ArrayList got changed while in loop
			}
		}
		enterProfileList.add(enterProfile);
		populationCount++;
		if (enterProfile.hasFever()) potentialInfectedCount++;
		return enterProfile;
	}
	
	
	public EnterProfile removeProfile(int index) {
		//Fill Code Here
		EnterProfile enterProfile = enterProfileList.get(index);
		if (enterProfile.hasFever()) potentialInfectedCount--;
		enterProfileList.remove(enterProfile);
		populationCount--;
		return enterProfile;
	}
	


	public int getPopulationCount() {
		return populationCount;
	}

	public int getPotentialInfectedCount() {
		return potentialInfectedCount;
	}

	public ArrayList<EnterProfile> getEnterProfileList() {
		return enterProfileList;
	}
}
