package map;

public class MapNode<k, v> {

	public k key;
	public v value;
	public MapNode<k, v> next;

	MapNode(k key, v value) {
		this.key = key;
		this.value = value;
	}

}
