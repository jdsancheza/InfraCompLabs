import logging
import threading
import time

format = "%(asctime)s: %(message)s"
logging.basicConfig(format = format, level = logging.INFO, datefmt= "%H:%M:%S")

def process(msg: str):
    logging.info(msg)
    time.sleep(3)

thread = threading.Thread(target=process, args= ("Un saludo con un poco de espera",))
thread.start()