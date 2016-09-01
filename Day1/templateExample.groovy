import groovy.text.SimpleTemplateEngine
def text = 'Dear "$firstname $lastname",\nSo nice to meet you in <% print city %>.\nSee you in ${month},\n${signed}'
def binding = ["firstname":"Charanjit", "lastname":"Singh", "city":"San Francisco", "month":"December", "signed":"Groovy-Dev"]
def engine = new SimpleTemplateEngine()
template = engine.createTemplate(text).make(binding)

println template
println("\n")
def result = 'Dear "Charanjit Singh",\nSo nice to meet you in San Francisco.\nSee you in December,\nGroovy-Dev'
assert result == template.toString()

println result
