package com.platzi.functionalproject;

import com.beust.jcommander.JCommander;
import com.platzi.functionalproject.CLI.CLIArguments;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.platzi.functionalproject.CommanderFunctions.buildCommanderWithName;
import static com.platzi.functionalproject.CommanderFunctions.parseArguments;

@SpringBootApplication
public class FunctionalProjectApplication {

	public static void main(String[] args) {
		JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

		Stream<CLIArguments> streamOfCLI = parseArguments(jCommander, args, JCommander::usage).orElse(Collections.emptyList()).stream().map(obj -> (CLIArguments) obj);

		Optional<CLIArguments> cliArgumentsOptional =streamOfCLI.filter(cli -> !cli.isHelp()).filter(cli -> cli.getKeyword() != null).findFirst();

		cliArgumentsOptional.map(CLIFunctions::toMap)
							.map(FunctionalProjectApplication::executeRequest)
							.orElse(Stream.empty())
							.forEach(System.out::println);
	}

	private static Stream<Post> executeRequest(Map<String, Object> params){

	}

}
