type 'a option = None | Some of 'a ;;

match [1;2;3] with
    x::y -> x
  | _ -> 2
;;
(* - : int = 1 *)

match [1;2;3] with
    x::y -> y
  | _ -> [2]
;;
(* - : int list = [2;3] *)

match Some 1 with
    None -> 2
  | Some x -> x
;;
(* - : int = 1 *)

match None with
    Some x -> x
  | None -> 2
;;
(* - : int = 2 *)

match () with
    () -> 1
;;
(* - : int = 1 *)

match [] with
    x::y -> 1
  | [] -> 2
;;
(* - : int = 2 *)

match [1] with
    x::y -> 1
  | [] -> 2
;;
(* - : int = 1 *)

match Some 1 with
    None -> 2
  | Some _ -> 1
;;
(* - : int = 1 *)
