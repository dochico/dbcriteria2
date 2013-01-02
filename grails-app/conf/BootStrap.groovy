import dbcriteria.Author
import dbcriteria.Book

class BootStrap {

    def init = { servletContext ->
		def authors = []
		
		def amountOfAuthors = 20
		 
		amountOfAuthors.times {
			authors << new Author(firstName: 'Simon' + it, name: 'Sample' + it ).save()
		}
		
		((int)amountOfAuthors / 2).times {
			new Book(title: 'Foo' + it, pages: 100 + it, author: authors[new Random().nextInt(amountOfAuthors)]).save(flush:true, failOnError:true)
		}
	}
    def destroy = {
    }
}
