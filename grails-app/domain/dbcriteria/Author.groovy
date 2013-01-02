package dbcriteria

class Author {
	
	String firstName
	String name
	
    static constraints = {
		firstName (blank:false, nullable:false, maxSize:50)
		name (blank:false, nullable:false, maxSize:50)
    }
	
	String toString() {
		"$firstName $name"
	}
}
