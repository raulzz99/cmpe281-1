package pnguyen.grails.webservices

import groovyx.net.http.*
import static groovyx.net.http.ContentType.XML

class ApiClientController {

	def index() {

		def http = new HTTPBuilder("http://pnguyen-grails-webservices.aws.af.cm/api/show")
		String output = "<hr/>"
		
		http.request(Method.GET, XML) 
		{ 			
			response.success = 
			{ resp, xml -> 
				output += resp.status		
				output += xml	
				xml.product.each {
					output += "<hr/>"
					output += "<p>" 
					output += "Product ID: " + it.vendor.@id  
					output += "</p>"
					output += "<p>" 
					output += "Vendor ID: " + it.@id  
					output += "</p>"
					output += "<p>" 
					output += "Name: " + it.name  
					output += "</p>"
					output += "<p>" 
					output += "Price: " + it.price 
					output += "</p>"
					output += "<p>" 
					output += "SKU: " + it.sku 
					output += "<p/>"
				}
			} 
		}
		
		output += "<hr/>"
		render output
	}
}


/**

<list>
	<product id="1">
		<name>MacBook Pro 13</name>
		<price>1500.0</price>
		<sku>AAPL123456789</sku>
		<vendor id="1"/>
	</product>
	<product id="2">
		<name>Oracle Database 11g Standard</name>
		<price>5000.0</price>
		<sku>ORCL123456789</sku>
		<vendor id="2"/>
	</product>
</list>

**/