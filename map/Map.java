package map;

import java.util.ArrayList;

public class Map<k, v> {

	ArrayList<MapNode<k, v>> bucket;
	int size;
	int numBucket;

	public Map() {
		bucket = new ArrayList<>();
		numBucket = 20;
		for (int i = 0; i < numBucket; i++) {
			bucket.add(null);
		}
	}

	private int hasFunction(k key) {
		int hasCode = key.hashCode();
		return hasCode % numBucket;
	}

	public v removeKey(k key) {
		int bucketIndex = hasFunction(key);
		MapNode<k, v> head = bucket.get(bucketIndex);
		MapNode<k, v> previous = null;
		while (head != null) {
			if (head.key.equals(key)) {
				size--;
				if (previous == null) {
					bucket.set(bucketIndex, head.next);
				} else {
					previous.next = head.next;
					return head.value;
				}
			}
			previous = head;
			head = head.next;
		}
		return null;
	}

	public v getValue(k key) {
		int bucketIndex = hasFunction(key);
		MapNode<k, v> head = bucket.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key))
				return head.value;
			head = head.next;
		}
		return null;
	}

	public void put(k key, v value) {

		int bucketIndex = hasFunction(key);
		MapNode<k, v> head = bucket.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = bucket.get(bucketIndex);
		MapNode<k, v> newNode = new MapNode<>(key, value);
		size++;
		newNode.next = head;
		bucket.set(bucketIndex, newNode);

		double loadFactor = (1.0 * size) / numBucket;
		if (loadFactor > 0.7)
			rehash();
	}

	private void rehash() {
		ArrayList<MapNode<k, v>> temp = bucket;
		bucket = new ArrayList<>();
		for (int i = 0; i < 2 * numBucket; i++) {
			bucket.add(null);
		}
		size = 0;
		numBucket *= 2;

		for (int i = 0; i < temp.size(); i++) {
			MapNode<k, v> head = temp.get(i);
			while (head != null) {
				k key = head.key;
				v value = head.value;
				put(key, value);
				head = head.next;
			}
		}
	}
}
