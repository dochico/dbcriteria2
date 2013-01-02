package dbcriteria

class AuthorController {
    static scaffold = true
	
	def listBookAuthors() {
		
		def result = Book.createCriteria().list {
			createAlias('author', 'author')
			projections {
				distinct('author')
				property('author.name')
			}
			order('author.name', 'asc')
		}
		
		render result.join("<br/>")
	}
}
