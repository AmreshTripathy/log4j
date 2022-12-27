package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class DesignBrowserHistory {
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String homepage = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BrowserHistory browserHistory = new BrowserHistory(homepage);
        for(int i = 0; i < n; i++) {
            String q = sc.nextLine();
            String[] query = q.split("\\s+");
            if(query[0].equals("visit")){
                browserHistory.visit(query[1]);
            } else if(query[0].equals("back")){
                browserHistory.back(Integer.parseInt(query[1]));
            } else if(query[0].equals("forward")){
                browserHistory.forward(Integer.parseInt(query[1]));
            }
        }
        sc.close();
    }
}

class BrowserHistory {
	
	static class Node{
	    String data;
	    Node next;
	    Node prev;
	    Node(String data){
	        this.data = data;
	        next = null;
	        prev = null;
	    }
	}
	
	Node head = null; Node curr = null; Node tail = null;
    public BrowserHistory(String homepage) {
        Node node = new Node(homepage);
		head = node;
		curr = node;
		tail = node;
    }
    public void visit(String url) {
        Node node = new Node(url);
		node.prev = curr;
		curr.next = node;
		curr = curr.next;
		tail = curr;
    }
    public void back(int steps) {
        while(steps > 0 && curr != head) {
			curr = curr.prev;
			steps--;
		}
		System.out.println(curr.data);
    }
    public void forward(int steps) {
        while(steps > 0 && curr != tail){
			curr = curr.next;
			steps--;
		}
		System.out.println(curr.data);
    }
}
