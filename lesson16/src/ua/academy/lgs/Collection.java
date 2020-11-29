package ua.academy.lgs;

public class Collection {
	private Number[] array;

	public Collection(Number[] array) {
		this.array = array;
	}

	public class oddChanger implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < array.length;
		}

		@Override
		public Number next() {
			Integer toInt = array[count].intValue();
			if (toInt % 2 == 1) {
				array[count] = 0;
			}
			return array[count++];
		}
	}

	public oddChanger createChanger() {
		return new oddChanger();
	}

	public class Skipper implements Iterator {
		private int count = array.length - 1;

		@Override
		public boolean hasNext() {

			return count >= 2;
		}

		@Override
		public Number next() {
			return array[count -= 2];

		}
	}

	public Skipper createSkipper() {
		return new Skipper();
	}

}
