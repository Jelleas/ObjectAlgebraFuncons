exception Not_found ;;
(* Exception Not_found defined. *)

let rec (assoc : 'a -> ('a * 'b) list -> 'b) = fun x l ->
   match (l : ('a * 'b) list) with
   | [] -> raise Not_found
   | [(y,z)::yzs] -> if x = y then z else (assoc x yzs);;
(* assoc : 'a -> ('a * 'b) list -> 'b = <fun> *)

let name_of_binary_digit digit =
  try
    assoc digit [(0, "zero"), (1, "one")]
  with Not_found ->
    "not a binary digit";;
(* name_of_binary_digit : int -> string = <fun> *)

name_of_binary_digit 0;;
(* - : string = "zero" *)

name_of_binary_digit (-1);;
(* - : string = "not a binary digit" *)

