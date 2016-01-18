package com.lprates.concurrency.smokersclub.smoker;


import com.lprates.concurrency.smokersclub.elements.Elements;
import com.lprates.concurrency.smokersclub.monitor.SmokersClubMonitor;

public class Smoker implements Runnable {

		private boolean smoked;
		private String smokerName;
		private SmokersClubMonitor smokersClubMonitor;
		private Elements elements;

		public Smoker(String smokerName, SmokersClubMonitor smokersClubMonitor, Elements elements) {
			this.smoked = false;
			this.smokerName = smokerName;
			this.smokersClubMonitor = smokersClubMonitor;
			this.elements = elements;
		}

		public boolean isSmoked() {
			return smoked;
		}

		public void setSmoked(boolean smoked) {
			this.smoked = smoked;
		}

		public String getSmokerName() {
			return smokerName;
		}

		public void setSmokerName(String smokerName) {
			this.smokerName = smokerName;
		}

		public SmokersClubMonitor getSmokersClubMonitor() {
			return smokersClubMonitor;
		}

		public void setSmokersClubMonitor(SmokersClubMonitor smokersClubMonitor) {
			this.smokersClubMonitor = smokersClubMonitor;
		}

		public Elements getElements() {
			return elements;
		}

		public void setResources(Elements elements) {
			this.elements = elements;
		}

		@Override
		public void run() {

			smokersClubMonitor.resourceGathering(elements);
			// System.out.println("Gathered Resources: "+Thread.currentThread.getName());

			smokersClubMonitor.resourceReturning(elements);
			// System.out.println("Returned Resources: "+Thread.currentThread.getName());

			// System.out.println("Exiting Club: "+Thread.currentThread.getName());


		}

}
