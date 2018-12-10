use std::io;

fn main() {
    let mut input = String::new();
    match io::stdin().read_line(&mut input) {
        Ok(n) => {
            println!("{} bytes read", n);
            println!("{}", input);
        }
        Err(error) => println!("error: {}", error),
    }

    let height: f32 = input.parse().unwrap();
    println!("{}", height.to_string());
}