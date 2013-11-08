import play.api.mvc.WithFilters

object Global extends WithFilters(filters.CorsFilter) {

}