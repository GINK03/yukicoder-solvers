use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let mut map:HashMap<String, bool> = HashMap::new();
  let vec = "1 2 3 4 5 6 7 8 9 10".split(' ').collect::<Vec<&str>>();
  for x in vec.iter() {
    map.insert( x.to_string(), true );
  }
  let stdin         = io::stdin();
  let line          = stdin.lock().lines().next().unwrap().unwrap();
  let vec           = line.split(' ').collect::<Vec<&str>>();
  for x in vec.iter() {
    map.remove(&x.to_string());
  }
  for (k, v) in map.iter() {
    println!("{}", k);
  }
}