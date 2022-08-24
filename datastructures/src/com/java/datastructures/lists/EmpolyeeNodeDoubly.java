package com.java.datastructures.lists;

public class EmpolyeeNodeDoubly {

	private Employee employee;
	private EmpolyeeNodeDoubly next;
	private EmpolyeeNodeDoubly previous;

	public EmpolyeeNodeDoubly(Employee employee) {
		this.employee = employee;
	}

	public EmpolyeeNodeDoubly getNext() {
		return next;
	}

	public void setNext(EmpolyeeNodeDoubly next) {
		this.next = next;
	}

	public EmpolyeeNodeDoubly getPrevious() {
		return previous;
	}

	public void setPrevious(EmpolyeeNodeDoubly previous) {
		this.previous = previous;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpolyeeNodeDoubly other = (EmpolyeeNodeDoubly) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmpolyeeNodeDoubly [employee=" + employee + "]";
	}

}
