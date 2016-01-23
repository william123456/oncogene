package oncogene;

import java.util.ArrayList;

public class Oncogene {
	public boolean isOncogene(ArrayList<String> healthyList, ArrayList<String> cancerList, String geneToBeChecked) {
		int healthyGenes = 0;
		int cancerGenes = 0;
		int totalGenes = 0;
		for (String s : healthyList) {
			
			if (s == geneToBeChecked) {
				cancerGenes++;

			} else {
				healthyGenes++;
			}
			totalGenes++;

		}

	}

}
