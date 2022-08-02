import Header from "../Header"
import RetiroList from "../RetiroList"


const Home = () => {
  return (
    <main>
      <div className="container">
        <section id="mcc-retiros-list">
          <RetiroList />
        </section>
      </div>
    </main>
  )
}

export default Home