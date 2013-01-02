package dbcriteria

class Book {
	
	String title
	Integer pages
	Author author

    static constraints = {
		title(blank:false, nullable:false, maxSize:50)
		pages(min:1)
    }
}
