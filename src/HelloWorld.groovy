def technologies = []

technologies.add("Grails")

println technologies

technologies << "Groovy"

println technologies

technologies.addAll(["Gradle","Griffon"])

println technologies

technologies = technologies - "Griffon"

println technologies

technologies.each {
    println "Technology: $it"
}

technologies.eachWithIndex{
    it, i -> println "$i: $it"
}

contained = technologies.contains('Groovy')

println(contained)

def defmap = [:]

defmap = ['name' : 'Roberto', 'framework' : 'Grails', 'language' : 'Groovy']
defmap.put('lastName' , 'Perez')

println defmap