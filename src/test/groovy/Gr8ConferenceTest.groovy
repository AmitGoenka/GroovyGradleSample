import spock.lang.Specification

class Gr8ConferenceTest extends Specification {
	def someAttendeeMethod () {
		setup:
			Gr8Conference gr8Conference = new Gr8Conference()
			gr8Conference.presenter = "Jenn"
			gr8Conference.attendeeMe = "Amit"
			gr8Conference.noOfAttendees = 13
		when:
			def summary = gr8Conference.summary()
		then:
			summary == "JennAmit13"
	}
}