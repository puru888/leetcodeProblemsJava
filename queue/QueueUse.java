package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		// QueueUsingArr q = new QueueUsingArr();
		QueueUsingLL<Integer> q = new QueueUsingLL<>();
		for (int i = 1; i <= 5; i++) {
			q.enqueue(i);
		}

		q.dequeue();
		System.out.println(q.front());
		q.enqueue(1);
		
		while (!q.isEmpty()) {

			int temp = q.dequeue();
			System.out.println(temp);
		}
	}

}
